

set -e

ul_input_file=$1 

echo '* Running compiler on ul file'
java Compiler $ul_input_file > 'out.ir' 

echo '* Generating jasmin file "out.j"'
/home/jcorless/csc435/codegen/codegen --file='out.ir'> out.j

echo '* Generating class file'
java jasmin.Main out.j

echo '* Running program!\n'

java myclassname 

echo '\n* Done' 
