# Git Aliases

```bash
s = status
 
# flog means formatted log
flog = log --oneline --graph

# rflog means format logs but in reverse
rflog = log --reverse --oneline

# prevc means og back to previous commit (keep that in mind, it will remove your last commit)
prevc = reset --hard HEAD~1

undomerge = reset --merge HEAD~1

# shows how many commits made in the git repo
commitcount = rev-list HEAD --count

# prints git configurations
printconfig = config --list

# allow you to edit configurations in your default file editor
editconfig = config --global --edit

# shows detailed log about each commit (changed files, how many changes made and so on...)
logstat = log --stat

# shows each author made how many commits
cstat = shortlog -s

# ucs means undo commit soft 
ucs = reset --soft HEAD~1

# uch means undo commit hard
uch = reset --hard HEAD~1

# wg means what changed
wg = whatchanged

# subu means submodule update
subu = submodule update --recursive
```