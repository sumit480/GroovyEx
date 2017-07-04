$branch = git for-each-ref --format='%(refname:short)' refs/heads/
foreach ($br in $branch){
#cd opics4plus
echo $br
git show-branch $br
git log --oneline --graph --decorate $br
#git log $br
}