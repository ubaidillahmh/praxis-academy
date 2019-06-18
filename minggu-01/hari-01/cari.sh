set -e
# find $1 -name "*.java"

if [ $(find $1 -name "*.java") ] ; 
then 
    echo "Ada Java $*" 
else 
    echo "Tidak ada java"
fi