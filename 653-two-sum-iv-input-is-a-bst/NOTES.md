fun(root,target,sum=target- root.value )// 4
if(root.val==sum) return true
if(sum<root.value) fun(root.left,
else root.right;