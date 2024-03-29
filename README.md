# algorithm_java

Doit! 알고리즘 코딩 테스트 

## 시간복잡도
 - 빅오메가 : 최선일 때 연산 횟수를 나타낸 표기법
 - 빅세타 : 보통일 때 연산 횟수를 나타낸 표기법
 - 빅 오 : 최악일 때 연산 횟수를 나타낸 표기법

### 제한시간
 - 제한시간 1초당 1억번 이하의 연산이라고 생각한다
 ex )  시간제한 2초 -> 2억번 이하의 연산
   

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

#### java 의 hashmap value 정렬
```java
Map<String, Integer> map = new Hashmap<String, Integer>();
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
                }
        });
```
Map의 key 비교 map.keySet() : key 를 리스트로 반환
Map의 value 비교 map.entrySet() : key, value

## 정렬
 - 데이터를 순서대로 나열하는 방법

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

### 분할 정복
 - 문제를 작은 2개의 문제로 분리하고 해결한 뒤 결과를 모아 원래의 문제를 해결하는 전략

### 기수 정렬
 - 값을 놓고 비교할 자릿수를 정한 다음 해당 자릿수만 비교
 - O(kn,  k는 데이터 자릿수)
 - 시간 복잡도가 가장 짧은 정렬 ( 코테에서 데이터의 개수가 너무 많다면 기수 정렬을 사용해본다)


## 탐색
 - 주어진 데이터(정렬 or 비정렬)에서 자신이 원하는 데이터를 찾아내는 알고리즘
 
### 깊이 우선 탐색, DFS
 - 그래프 완전 탐색 기법 중 하나
 - 그래프 시작 노드에서 출발하여 탐색할 한 쪽 분기를 정하여 최대 깊이까지 탐색 후 다른쪽 분기를 탐색
 - O(V + E, V는 노드 수 , E는 에지 수)
 - 한 번 방문한 노드는 다시 방문 X, 방문 여부를 체크해야함 
 - 후입선출 특성을 가짐
 - 재귀함수로 구현 or 스택 자료구조 이용


 **DFS 초기작업**
 1. 인접 리스트로 그래프 표현
 2. 방문 배열 초기화
 3. 시작 노드 스택에 삽입하기


### 너비 우선 탐색, BFS
 - 그래프 완전 탐색 기법 중 하나
 - 시작 노드에서 출발해 시작 노드를 기준으로 가까운 노드를 먼저 방문하며 탐색하는 알고리즘
 - FIFO 탐색
 - Queue 자료구조 이용
 - O(V + E, V는 노드 수 , E는 에지 수)


 **BFS 초기작업**
 1. 인접 리스트로 그래프 표현
 2. 방문 배열 초기화
 3. 시작노드 큐에 삽입하기

### 이진 탐색
 - 정렬된 데이터에서 대상 데이터의 중앙 값과 찾고자 하는 값을 비교해 데이터의 크기를 절반씩 줄이며 대상을 찾음
 - O(logN)

 **이진탐색과정**
 - 오름차순 일 시, 내림차순이라면 조건을 반대로 하여 과정을 반복
 1. 현재 데이터셋의 중앙값을 선택한다
 2. 중앙값 > 타깃 데이터 일때 중앙값 기준으로 왼쪽 데이터 셋을 선택
 3. 중앙값 < 타깃 데이터 일때 중앙값 기준으로 오른쪽 데이터 셋을 선택
 4. 1-3 을 반복하다가 중앙값 == 타깃 데이터 일때 탐색 종료

## 그래프
 - 노드 와 엣지 로 구성
 - 노드 : 데이터를 표현하는 단위
 - 엣지 : 노드를 연결

##  그리디
 - 현재 상태에서 볼 수 있는 선택지 중에 최선의 선택을 하는 알고리즘
 - 항상 최적을 보장하진 못함
 
 **핵심 이론**
 1. 해선택 : 현재 상태에서 가장 최선이라고 생각되는 해 선택
 2. 적절성 검사 : 현재 선택한 해가 전체 문제의 제약조건에 벗어나지 않는지 검사
 3. 해검사: 현재까지 선택한 해 집합이 전체 문제를 해결할 수 있는지 검사
           전체 문제를 해결하지 못한다면 1로 돌아가 과정 반복
    

### 유클리드 호제법
(A>B) 인 A, B 가 있을때 두 수의 GCD(최대공약수)는 A를 B로 나눈 나머지 를 r 이라 할때
B,r 사이의 최대 공약수와 같다
호제법이란
두 수가 서로 상대방 수를 나누어 결국 원하는 수를 얻는 알고리즘