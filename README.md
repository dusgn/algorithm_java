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