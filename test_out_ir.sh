echo ' * doing stuff ' 
/home/jcorless/csc435/codegen/codegen --file='out.ir'> out.j
java jasmin.Main out.j
java myclassname
