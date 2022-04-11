var year=2000;
var count=0;
while(count<15){
    if((year%4==0 && year%100!==0)||(year%400==0)){
        alert(year);
        count=count+1;
    }
    year=year+1;
}