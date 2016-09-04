
public class GenericStack<E> {
	private E[] list;
	private int finger = -1;
	
	public GenericStack(int room){
		list= (E[])new Object[room];
	}
	
	public int getSize(){
		return finger + 1;
	}
	
	public E peek(){
		return list[finger];
	}

	public void push(E o){
		if(getSize() < list.length)
		{
			list[getSize()] = o;
			finger ++;
		}
        else {
            E[] temp = (E[])new Object[list.length];
            for(int i = 0;i < list.length;i ++){
                temp[i] = list[i];
            }
            list = (E[])new Object[temp.length * 2];
            for(int i = 0;i < temp.length;i ++){
                list[i] = temp[i];
            }
            push(o);
        }
	}
	
	public E pop(){
		E o = list[getSize() - 1];
        finger --;
        return o;
	}

    public boolean isEmpty(){
        if(finger == -1)
            return true;
        else 
            return false;

    }

    public void print(){
        for(int i = 0;i < this.getSize();i ++){
            System.out.print("|");
            System.out.printf("%5d",list[this.getSize() - i - 1]);
            System.out.print("     ");
            System.out.println("|");
            System.out.println(" ---------- ");
        }
    }
}
