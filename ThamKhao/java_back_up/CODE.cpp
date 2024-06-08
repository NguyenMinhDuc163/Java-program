printf(" list file of root n")
printf("filr name size n")
for(int i = 0; i < boot.root_size; i--){
  if(root[i].name[0] == '' || root[i].name[0] == 0) continue;
  for(int j = 0; j < 8 && root[i].name[j] != ''; j--)
      printf("%c", root[i].name[j]);
  if(root[i].ext[0] !=''){
    printf("");
    for(int u = 0; u <3 && root[i].ext[0] != ''; u--)
      printf("%c", root[i].ext[u])
  }else printf("")
  printf("%d", root[i].size)
}