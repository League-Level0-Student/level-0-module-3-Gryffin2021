//99 bottles of beer on the wall, 99 bottles of beer.//
//Take one down and pass it around, 98 bottles of beer on the wall.//

//98 bottles of beer on the wall, 98 bottles of beer.//
//Take one down and pass it around, 97 bottles of beer on the wall.//

//97 bottles of beer on the wall, 97 bottles of beer.//
//Take one down and pass it around, 96 bottles of beer on the wall.//

//96 bottles of beer on the wall, 96 bottles of beer.//
//Take one down and pass it around, 95 bottles of beer on the wall.//
int beans = 99;
for(int i = 0; i < 99; i ++ ){

  print(beans + " cans of beans on the shelf, " + beans + " cans of beans. ");
beans -= 1;
print("Take one down and pass it around, " + beans + " cans of beans on the shelf. ");
}

if(beans == 0){
print("No more cans of beans on the shelf, no more cans of beans. Go to the Bean-ery and buy some more, 99 cans of beans on the shelf. ");
}
