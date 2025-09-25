//7. check whether a given number is armstrong or not .
class Armstrong{
public static void main(String[] args) {
int num=34;   
int original=num;
int result=0;
for (int i=num;i>0;i=i/10) {
int digit=i % 10;               
result +=Math.pow(digit,3);   
}
if (result==original) {
System.out.println(original + " is an Armstrong number.");
} else {
System.out.println(original + " is not an Armstrong number.");
}
}
}