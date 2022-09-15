int len=changed.length;
if((len&1)==1) return new int[0];
Arrays.sort(changed);
Map<Integer,Integer> hm=new HashMap<>();
int res[] = new int[len/2];
int j=0;
for(int i=0;i<len;i++){
int ele=changed[i];
hm.put(ele,hm.getOrDefault(ele,0)+1);
}
for(int i=0;i<len;i++){
int ele=changed[i];
if(hm.containsKey(ele)){
if(hm.containsKey(ele*2)){
res[j++]=ele;
hm.put(ele,hm.get(ele)-1);
hm.put(ele*2,hm.get(ele*2)-1);
if(hm.get(ele)<=0) hm.remove(ele);
if(hm.containsKey(ele*2)&& hm.get(ele*2)<=0) hm.remove(ele*2);
}
else return new int[0];
}
}
return res;
}
}