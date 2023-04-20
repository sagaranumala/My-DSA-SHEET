class HelloWorld {
    public static void main(String[] args) {
        int a1[]={1,3,5,6,7,9,88};
        int a2[]={3,4,5,6,7,22};
        int n1=a1.length;
        int n2=a2.length;
        int n3=n1+n2;
        int a3[]=new int[n3];
        int x=0;
        int y=0;
        for(int i=0;i<n3;i++){
            if(x==n1){
                while(y<n2){
                    a3[i++]=a2[y++];
                }
                break;
            }
            if(y==n2){
                while(x<n1){
                a3[i++]=a1[x++];
                }
                break;
            }
            if(a1[x]==a2[y]){
                a3[i]=a1[x];
                a3[i+1]=a2[y];
                x++;
                y++;
                i++;
            }else if(a1[x]>a2[y]){
                a3[i]=a2[y];
                y++;
            }else{
                a3[i]=a1[x];
                x++;
            }
        }
        for(int i=0;i<n3;i++){
        System.out.print(a3[i]+" ");
        }
    }
}