function square(array){
    val=[];
    
    for(var x=0, len=array.length;x<len;x++){
        val.push(array[x]*array[x]);
    }
    return val;
}
function sqrt(array){
    val=[];
    for(var x=0, len=array.length;x<len;x++){
        val.push(Math.sqrt(array[x]));
    }
    return val;
    
}
document.write("square: "+square([1,2,3,4,5])+"<br>");
document.write("Squareroot: "+sqrt([1,4,9,16,25]));