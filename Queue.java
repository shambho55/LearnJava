public interface Queue<Item> extends Iterable<Item>{

Item dequeue();
void enqueue(Item item);
boolean isEmpty();
int size();

}
