# Docker Aliases

```bash
# usage: docker rmia; (remove all stopped containers)
# usage: docker stopa; (stop all containers)
docker() {
  if [ "$1" = "rmia" ]; then
    shift
    docker rm $(docker ps -a -q) "$@"
  elif [ "$1" = "stopa" ]; then
   shift
   docker kill $(docker ps -q)
  else
    command docker "$@"
  fi
}
```