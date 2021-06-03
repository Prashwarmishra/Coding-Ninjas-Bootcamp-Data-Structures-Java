package hashMap;

import java.util.ArrayList;

public class Map<K,V> {
	ArrayList<MapNode<K,V>> buckets;
	int size;
	int numBuckets;
	
	public Map() {
		buckets = new ArrayList<>();
		numBuckets = 5;
		for(int i=0; i<numBuckets; i++) {
			buckets.add(null);
		}
	}
	
	private int getBucketIndex(K key) {
		int index = key.hashCode();
		return index%numBuckets;
	}
	
	public int size() {
		return size;
	}
	
	double loadFactor() {
		return ((size)*1.00)/(numBuckets);
	}
	
	private void rehash() {
		ArrayList<MapNode<K,V>> temp = buckets;
		buckets = new ArrayList<>();
		numBuckets *= 2;
		for(int i=0; i<numBuckets; i++) {
			buckets.add(null);
		}
		size = 0;
		for(int i=0; i<temp.size(); i++) {
			MapNode<K, V> head = temp.get(i);
			while(head != null) {
				insert(head.key, head.value);
				head = head.next;
			}
		}
	}
	
	public void insert(K key, V val) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K,V> head = buckets.get(bucketIndex);
		while(head != null) {
			if(head.key.equals(key)) {
				head.value = val;
				return;
			}
			head = head.next;
		}
		head = buckets.get(bucketIndex);
		MapNode<K, V> newNode = new MapNode<>(key, val);
		newNode.next = head;
		buckets.set(bucketIndex, newNode);
		size++;
		double loadFactor = loadFactor();
		if(loadFactor > 0.7) {
			rehash();
		}
	}
	
	public boolean isPresent(K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		while(head != null) {
			if(head.key.equals(key)) {
				return true;
			}
			head = head.next;
		}
		return false;
	}
	
	public V getValue(K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		while(head != null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	public V removeKey(K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		MapNode<K, V> prev = null;
		
		while(head != null) {
			if(head.key.equals(key)) {
				if(prev != null) {
					prev.next = head.next;
				}else {
					buckets.set(bucketIndex, head.next);
				}
				size--;
				return head.value;
			}
			prev = head;
			head = head.next;
		}
		return null;
	}
}
