package Final;

import java.util.ArrayList;

public class Queue {
	
	 private ArrayList<Person> people = new ArrayList<>();
	 
	 public void enqueue(Person p) {
	        people.add(p);
	    }

	    public ArrayList<Person> getList() {
	        return people;
	    }
	    
	    public void printQueue() {
	        for (Person p : people) {
	            System.out.println(p);
	        }
	    }
	    
	    public void quickSortByLastName() {
	        quickSortLastName(0, people.size() - 1);
	    }
	    
	    private void quickSortLastName(int low, int high) {
	        if (low < high) {
	            int pi = partitionLastName(low, high);
	            quickSortLastName(low, pi - 1);
	            quickSortLastName(pi + 1, high);
	        }
	    }
	    
	    private int partitionLastName(int low, int high) {
	        String pivot = people.get(high).getLastName();
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (people.get(j).getLastName().compareToIgnoreCase(pivot) > 0) {
	                i++;
	                swap(i, j);
	            }
	        }
	        swap(i + 1, high);
	        return i + 1;
	    }
	    
	    public void quickSortByAge() {
	        quickSortAge(0, people.size() - 1);
	    }
	    
	    private void quickSortAge(int low, int high) {
	        if (low < high) {
	            int pi = partitionAge(low, high);
	            quickSortAge(low, pi - 1);
	            quickSortAge(pi + 1, high);
	        }
	    }
	    
	    private int partitionAge(int low, int high) {
	        int pivot = people.get(high).getAge();
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (people.get(j).getAge() > pivot) {
	                i++;
	                swap(i, j);
	            }
	        }
	        swap(i + 1, high);
	        return i + 1;
	    }

	    private void swap(int i, int j) {
	        Person temp = people.get(i);
	        people.set(i, people.get(j));
	        people.set(j, temp);
	    }
}
