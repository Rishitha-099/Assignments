function square(number){
    return number*number;
}
var resList=[];
function map(list,fun){
   if(list.length==0){
     return;
   }
   resList.push(fun(list.slice(0,1)))
   list= list.slice(1,(list.length));
   return map(list,fun);
}
map([1,2,3,4,5],square);
document.write(resList+"<br>");
var resList=[];
map([1,4,9,16,25],Math.sqrt);
document.write(resList);