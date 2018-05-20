function solve(arr) {
    let obj = {};
    for (let i = 0; i < arr.length; i++) {
        let vals = arr[i].split(' -> ');
        let a = Number(vals[1]);
        if (isNaN(a)) {
            obj[vals[0]] = vals[1];
        }else {
            obj[vals[0]] = a;
        }
    }
    let str = JSON.stringify(obj);
    console.log(str);
}

solve(['{"name":"Gosho","age":10,"date":"19/06/2005"}', '{"name":"Tosho","age":11,"date":"04/04/2005"}','{"name":"Maria","age":24,"date":"31/12/1996"}'])