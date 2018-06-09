//存在HashMap数组吗？
//第12题
class Solution {
    private HashMap<Integer,String> map1=new HashMap<>();
    private HashMap<Integer,String> map2=new HashMap<>();
    private HashMap<Integer,String> map3=new HashMap<>();
    {
        map1.put(1,"I");map1.put(2,"V");map1.put(3,"X");
        map2.put(1,"X");map2.put(2,"L");map2.put(3,"C");
        map3.put(1,"C");map3.put(2,"D");map3.put(3,"M");
    }
    public String intchange(int i,int num){
        switch(i){
            case 1:{
                switch(num){
                    case 0:return "";
                    case 1:return map1.get(1);
                    case 2:return map1.get(1)+map1.get(1);
                    case 3:return map1.get(1)+map1.get(1)+map1.get(1);
                    case 4:return map1.get(2)+map1.get(1);
                    case 5:return map1.get(2);
                    case 6:return map1.get(1)+map1.get(2);
                    case 7:return map1.get(1)+map1.get(1)+map1.get(2);
                    case 8:return map1.get(1)+map1.get(1)+map1.get(1)+map1.get(2);
                    case 9:return map1.get(3)+map1.get(1);
                }
            }
            case 2:{
                switch(num){
                    case 0:return "";
                    case 1:return map2.get(1);
                    case 2:return map2.get(1)+map2.get(1);
                    case 3:return map2.get(1)+map2.get(1)+map2.get(1);
                    case 4:return map2.get(2)+map2.get(1);
                    case 5:return map2.get(2).toString();
                    case 6:return map2.get(1)+map2.get(2);
                    case 7:return map2.get(1)+map2.get(1)+map2.get(2);
                    case 8:return map2.get(1)+map2.get(1)+map2.get(1)+map2.get(2);
                    case 9:return map2.get(3)+map2.get(1);
                }
            }
            case 3:{
                switch(num){
                    case 0:return "";
                    case 1:return map3.get(1);
                    case 2:return map3.get(1)+map3.get(1);
                    case 3:return map3.get(1)+map3.get(1)+map3.get(1);
                    case 4:return map3.get(2)+map3.get(1);
                    case 5:return map3.get(2);
                    case 6:return map3.get(1)+map3.get(2);
                    case 7:return map3.get(1)+map3.get(1)+map3.get(2);
                    case 8:return map3.get(1)+map3.get(1)+map3.get(1)+map3.get(2);
                    case 9:return map3.get(3)+map3.get(1);
                }
            }
            case 4:{
            	  StringBuilder sb2=new StringBuilder();
                  for(int j=0;j<num;j++) {
                  	sb2.append("M");
                  }
                  return sb2.toString();            
            }
          }
        return "";
        }
    public String intToRoman(int num) {
        int i=1;
        StringBuilder sb=new StringBuilder();
        while(num>0){
            sb.append(intchange(i,num%10));
            num=num/10;
            i++;
        }
        return sb.reverse().toString();
    }
}