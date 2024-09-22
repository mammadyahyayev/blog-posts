# Docker Aliases

```bash
# usage: docker rmia; (remove all stopped containers)
# usage: docker stopa; (stop all containers)
# usage: docker health <container-id or container-name> 
# note: install jq command for formatted output
docker() {
  if [ "$1" = "rmia" ]; then
    shift
    docker rm $(docker ps -a -q) "$@"
  elif [ "$1" = "stopa" ]; then
   shift
   docker kill $(docker ps -q)
  elif [ "$1" = "health" ]; then
    shift
    docker inspect --format '{{json .State}}' "$1" | jq
  else
    command docker "$@"
  fi
}
```