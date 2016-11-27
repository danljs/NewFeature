
function hi(){
	var a = 'PROSPER'.toLowerCase(); 
	middle(); 
	print('Live long and' + a)
}
function middle(){
	var b = 1; 
	for(var i=0, max = 10; i<max;i++){
		b++;
	}
	print('b is '+b);
}
hi();