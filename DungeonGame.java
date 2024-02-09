import java.io.*;

class DungeonGame implements Serializable{

public int x = 3;

transient long y = 4;

private short z = 5;

int getX(){

return x;

}

/*
void setX(int X){

x = X;

}
*/

long getY(){

return y;

}

short getZ(){

return z;

}

}
