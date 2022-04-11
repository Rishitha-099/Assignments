function maxofthree(a1,a2,a3){
    if(a1>a2 && a1>a3){
        document.write(a1);
    }
    else if(a2>a3 && a2>a1){
        document.write(a2);
    }
    else{
        document.write(a3);
    }
}
maxofthree(1,2,3);