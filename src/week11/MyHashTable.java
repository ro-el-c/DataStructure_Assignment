package week11;

import java.util.ArrayList;

public class MyHashTable {
    private ArrayList bucketArray;
    private int bucketCapacity; // 용량
    private int cnt; // 실제 들어있는 양
    private float loadFactor;

    public MyHashTable(int initialCapacity){
        this.bucketArray = new ArrayList();
        this.bucketCapacity = initialCapacity;
        this.loadFactor = Integer.MAX_VALUE;
        this.cnt=0;

        for(int i=0; i<initialCapacity; i++)
            this.bucketArray.add(null);
    }
    public MyHashTable(int initialCapacity, float loadFactor){
        this.bucketArray = new ArrayList();
        this.bucketCapacity = initialCapacity;
        this.loadFactor = loadFactor;
        this.cnt=0;

        for(int i=0; i<initialCapacity; i++)
            this.bucketArray.add(null);
    }
    public int hasFunc(String k){
        int h=0;
        int a=33;
        for(int i=0; i<k.length(); i++){
            h = (h<<5) | (h>>>27);
            h += (int)(k.charAt(i)*Math.pow(a, k.length()-i-1));
        }
        h %= this.bucketCapacity;
        return h;
    }
    public int size(){
        return this.cnt;
    }
    public String get(String k){
        int key = this.hasFunc(k);
        String result = null;
        ArrayList tempList = (ArrayList) this.bucketArray.get(key);

        if(tempList == null)
            System.out.println("empty");
        else{
            for(int i=0; i<tempList.size(); i++){
                StudentInfo temp =(StudentInfo) tempList.get(i);
                if(k.equals(temp.getStudentID()))
                    result = temp.getStudentName();
            }
        }

        return result;
    }
    public String put(String k, String v){
        if((this.getLoadFactor() > this.loadFactor) && this.loadFactor != Integer.MAX_VALUE)
            this.rehash(this.bucketCapacity*2);

        StudentInfo newStudent = new StudentInfo(k, v);
        int key = this.hasFunc(k);
        ArrayList tempList = (ArrayList) this.bucketArray.get(key);
        this.cnt++;

        if(tempList == null){
            ArrayList newList = new ArrayList();
            newList.add(newStudent);
            this.bucketArray.set(key, newList);
            return null;
        }
        else{
            tempList.add(newStudent);
            StudentInfo temp = (StudentInfo) tempList.get(0);
            return temp.getStudentName();
        }
    }

    public String remove(String k){
        int key = this.hasFunc(k);
        String result = null;

        ArrayList tempList = (ArrayList) this.bucketArray.get(key);

        if(tempList == null)
            System.out.println("empty");
        else{
            for(int i=0; i<tempList.size(); i++){
                StudentInfo temp = (StudentInfo) tempList.get(i);

                if(k.equals(temp.getStudentID())){
                    StudentInfo removeStudent = (StudentInfo) (tempList).remove(i);
                    result = removeStudent.getStudentName();
                    this.cnt--;
                }


            }
        }
        return result;
    }

    public void rehash(int capacity){
        ArrayList oldList = this.bucketArray;

        this.bucketCapacity = capacity;
        this.bucketArray = new ArrayList();
        for(int i=0; i<this.bucketCapacity; i++)
            this.bucketArray.add(null);
        this.cnt=0;

        for(int i=0; i<oldList.size(); i++) {
            ArrayList temp = (ArrayList) oldList.get(i);
            if (temp != null) {
                for (int j = 0; j < temp.size(); j++) {
                    StudentInfo tempStudentInfo = (StudentInfo) temp.get(j);
                    this.put(tempStudentInfo.getStudentID(), tempStudentInfo.getStudentName());
                }
            }
        }
    }

    public float getLoadFactor(){
        return (float) this.cnt/this.bucketCapacity;
    }

    public void printNowHashTable(){
        System.out.println("\nNow Hash Table :");
        if(this.loadFactor != Integer.MAX_VALUE)
            System.out.printf("Bucket Capacity : %d, Size : %d, LoadFactor : %.2f\n\n", this.bucketCapacity, this.size(), this.getLoadFactor());
        else
            System.out.printf("Bucket Capacity : %d, Size : %d\n\n", this.bucketCapacity, this.size());


        for(int i=0; i<this.bucketArray.size(); i++){
            ArrayList tempAL = (ArrayList) this.bucketArray.get(i);

            if(tempAL == null)
                System.out.println("--null--");
            else{
                for(int j=0; j<tempAL.size(); j++){
                    StudentInfo tempInfo = (StudentInfo) tempAL.get(j);
                    System.out.println(tempInfo.getStudentName());
                }
            }
        }
    }
}
