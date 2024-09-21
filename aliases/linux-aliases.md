# Linux Aliases

```bash
# edit .bashrc file in nano editor; 
alias editbash='sudo nano ~/.bashrc'

# call whenever you made changes to .bashrc file
alias resetbash='source ~/.bashrc'

# sort files by size desc
alias lsdesc="ls --human-readable --size -1 -S --classify"

# sort last modified files
alias lsmod='ls -t -1'

# see files with given extension; 'seefext' means see files by extension
# usage: seefext java
seefext() {
 find . -name "*.$1" -type f
}

# delete files with given extension; 
# 'delfext' means delete files by extension
# usage: delfext java; use seefext before delfext for safety
delfext() {
 find . -name "*.$1" -type f -delete
}

# change directories and view the content at the same time
# usage: cl <foldername>
function cl() {
    DIR="$*";
 # if no DIR given, go home
 if [ $# -lt 1 ]; then 
  DIR=$HOME;
    fi;
    builtin cd "${DIR}" && \
    # use your preferred ls command
 ls -F --color=auto
}
```