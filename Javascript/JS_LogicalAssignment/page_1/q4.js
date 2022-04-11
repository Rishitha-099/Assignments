function flipcoin(){
    return(Math.random()<0.3)?'Heads':'Tails';
}
var noOftimes=500;
var headcount=0;
for(var x=0;x<noOftimes;x++){
if(flipcoin()=='Heads'){
    headcount++;
}
}
document.write("Head Ratio "+(headcount/noOftimes)*100+"% of the time");