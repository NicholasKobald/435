set -e

ul_input_file=$1

echo '* Running compiler on ul file'
java Compiler $ul_input_file > 'out.j'

echo '* Generated out.j' 

echo '* Generating class file'
java jasmin.Main out.j

echo '* Running program!\n'
file=${ul_input_file##*/}  
java $file

echo ''
echo 'Done'
