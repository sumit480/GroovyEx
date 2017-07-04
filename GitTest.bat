REM for BRANCH in `git branch --list|sed 's/\*//g'`;
REM  do 
REM    git checkout $BRANCH
REM    git fetch
REM    git branch --set-upstream-to=origin/$BRANCH $BRANCH
REM  done
REM git checkout master;

REM git for-each-ref --shell \
REM  --format='git log --oneline %(refname) ^origin/master' \
REM  refs/heads/

for Branch in $(git branch); 
do
    git log --oneline $branch ^remotes/origin/master;
done