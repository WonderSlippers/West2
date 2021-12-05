package assighment2;


    public class printCross {
        public static void main(String[] args) {

        }
        public static void printCrossing(int[]arr1,int[]arr2) {
            final Object obj = new Object();
            new Thread(() -> {
                synchronized (obj) {
                    for (int n1 : arr1) {
                        System.out.print(n1+" ");
                        try {
                            obj.notify(); //叫醒其他线程，这里就是t2
                            obj.wait(); //让自己阻塞，让出锁
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    obj.notify(); //必须要有，因为两个线程的try里面的最后一步是阻塞，如果线程执行完了还在阻塞肯定不对，必须要唤醒，才能正确结束程序
                }
            }).start();

            new Thread(() -> {
                synchronized (obj) {
                    for (int n2: arr2) {
                        System.out.print(n2+" ");
                        try {
                            obj.notify(); //叫醒其他线程，这里是t1
                            obj.wait(); //让自己阻塞，让出锁
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    obj.notify(); //同上
                }
            }).start();
        }
    }

