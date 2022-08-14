# algorithm_java

Doit! 알고리즘 코딩 테스트 



### 스택 
 - 깊이 우선 탐색 DFS
 - 백트래킹

### 큐
 - 너비 우선 탐색 BFS

### 힙 _ Heap

- 완전이진트리
- 우선순위가 부모노드 > 자식노드 유지

### 우선순위 큐 _ PriorityQueue

 - 추가된 데이터의 순서와 상관 없이 우선순위가 가장 높은 데이터를 반환

 데이터를 삽입할 때 우선순위를 기준으로 힘을 구성 (add, offer) </br>
 데이터를 꺼낼 때 루트 노드를 얻은 뒤 루트노드를 삭제할 때 빈 루트 노드 위치에 맨 마지막 노드를 삽입한 후 우선순위로 정렬 (poll, remove) </br>

#### java 의 우선순위 큐 사용

최소힙
```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
```
최대힙
```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrdeR());
```
객체도 우선순위 구현 가능 Comparator 를 통해
```java
public class PriorityQueue<E> extends AbstractQueue<E>
        implements java.io.Serializable {
    
public Comparator<? super E> comparator() {
        return comparator;
    }
    
}
```

#### java 의 comparator 와 comparable
```java
interface Comparable<T> { public int compareTo(T o); }
public interface Comparator<T> {  int compare(T o1, T o2); }
// 두 객체가 같으면 0, 비교하는 값보다 작으면 음수, 크면 양수
```
컬렉션을 정렬하는데 필요한 메서드를 정의하며 이를 구현한 클래스는 정렬이 가능함
Charater, Interger 등 wrapper 클래스, String, Date, File 등

comparable : 기본 정렬기준을 구현하는데 사용
comparator : 기본 정렬기준 외에 다른 기준으로 정렬하고자 할 때 사용

Arrays.sort()는 배열을 정렬할 때 Comparator를 지정해주지 않으면 저장하는 객체는 주로 Comparable을 구현한 클래스의 객체에 구현된 내용에 따라 정렬된다.
```java
static void sort(Object[] a) // 객체 배열에 저장된 객체가 구현한 Comparable에 의한 정렬
static void sort(Object[] a, Comparator c) // 지정한 Comparator 에 의한 정렬
```
 - Java의 정석, 남궁성

***

## 정렬

### 버블정렬
 - 두 인접한 데이터의 크기를 비교해 정렬
 - O(n^2)
 - 지정된 범위의 loop를 돌며 인접한 데이터 간의 swap 연산으로 정렬

### 선택정렬
 - 최대 or 최소 데이터를 나열된 순으로 찾아가며 선택함
 - O(n^2)

### 삽입정렬
 - 이미 정렬된 데이터 범위에 정렬되지 않은 데이터를 삽입시켜 정렬
 - O(n^2)

### 퀵정렬
 - 기준값(pivot)을 선정해 해당 값보다 작은 데이터와 큰 데이터로 분류하는 것을 반복해 정렬
 - O(nlogn)
 - 기준값 선정이 시간 복잡도에 많은 영향을 끼침
 - 분할정복(Divide and Conquer)

### 병합정렬
 - 하나의 리스트를 절반 으로 나누어 분할 정복
 - O(nlogn)
 - 데이터를 비교 하면서 찾기때문에 비교 정렬이며 정렬의 대상이 되는 데이터 외에 추가적인 공간을 필요로 하기 때문에 제자리 정렬이 아니다



