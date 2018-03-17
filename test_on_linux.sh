

set -e

ir_input_file=$1 

echo '* Generating jasmin file "out.j"'
/home/jcorless/csc435/codegen/codegen --file=$ir_input_file > out.j

echo '* Generating class file'
java jasmin.Main out.j

echo '* Running program!'
# TODO: parametrize classname
java classname

