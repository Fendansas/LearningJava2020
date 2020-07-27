package com.epam.home.task6;

import java.util.*;

//Сравнить попарно HashMap и TreeMap, HashSet и TreeSet по времени добавления, удаления и поиска элементов
public class СomparisonSetAndMap {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> tree = new TreeSet<>();

        System.out.println("--------------HashSet------------TreeSet-----------------------------");
        addHasAndTree(set, tree); //добовляем позиции
        sizeSetAndTree(set, tree); // получаем размер и время на его получение
        addSetAndTree(set, tree); // добовляем 5 позиций через add
        clear(set); //удаляем все
        addHasAndTree(set, tree); //добовляем позиции
        remove(set); //удаляем выбранные позиции
        System.out.println("____________END______________");

        HashMap<Object, Object> hashMap = new HashMap<>();
        TreeMap<Object, Object> treeMap = new TreeMap<>();

        System.out.println("--------------HashMap------------TreeMap-----------------------------");
        addTreeAndHAshMap(hashMap, treeMap); // время добовления 5 элементов
        getSizeMap("Узнаем размер hashMap", hashMap.size(), "Узнаем размер treeMap", treeMap.size()); //размер и время
        getHashAndTree(hashMap, treeMap); // поиск элемента
        removeTreeAndHash(hashMap, treeMap); // удаляем позицию
        clearTreeAndHash(hashMap, treeMap); // удаляем все
        System.out.println("____________END______________");
    }

    private static void clearTreeAndHash(HashMap<Object, Object> hashMap, TreeMap<Object, Object> treeMap) {
        long startClearHash = System.nanoTime();
        hashMap.clear();
        long finishClearHash = System.nanoTime();
        long timeClearHash = finishClearHash - startClearHash;
        System.out.println("Время Hash удаляем все " + timeClearHash);

        long startClearMap = System.nanoTime();
        treeMap.clear();
        long finishClearMap = System.nanoTime();
        long timeClearMap = finishClearMap - startClearMap;
        System.out.println("Время MAp удаляем все " + timeClearMap);
    }

    private static void removeTreeAndHash(HashMap<Object, Object> hashMap, TreeMap<Object, Object> treeMap) {
        long startRemoveHash = System.nanoTime();
        hashMap.remove("SAS");
        long finishRemoveHash = System.nanoTime();
        long timeRemoveHash = finishRemoveHash - startRemoveHash;
        System.out.println("Время Hash удаляем элемент " + timeRemoveHash);

        long startRemoveTree = System.nanoTime();
        treeMap.remove("SAS");
        long finishRemoveTree = System.nanoTime();
        long timeRemoveTree = finishRemoveTree - startRemoveTree;
        System.out.println("Время Tree удаляем элемент " + timeRemoveTree);
    }

    private static void getHashAndTree(HashMap<Object, Object> hashMap, TreeMap<Object, Object> treeMap) {
        long startGetHash = System.nanoTime();
        System.out.println("SAS : " +hashMap.get("SAS"));
        long finishGetHash = System.nanoTime();
        long timeGetHash = finishGetHash - startGetHash;
        System.out.println("Время Hash " + timeGetHash);

        long startGetTree = System.nanoTime();
        System.out.println("GSG : " +treeMap.get("GSG"));
        long finishGetTree = System.nanoTime();
        long timeGetTree = finishGetTree - startGetTree;
        System.out.println("Время Tree " + timeGetTree);
    }

    private static void getSizeMap(String s, int size, String s2, int size2) {
        System.out.println(s);
        long startSizeHash = System.nanoTime();
        System.out.println(size);
        long finishSizeHash = System.nanoTime();
        long timeSizeHash = finishSizeHash - startSizeHash;
        System.out.println(timeSizeHash);

        System.out.println(s2);
        long startSizeTree = System.nanoTime();
        System.out.println(size2);
        long finishSizeTree = System.nanoTime();
        long timeSizeTree = finishSizeTree - startSizeTree;
        System.out.println(timeSizeTree);
    }

    private static void addTreeAndHAshMap(HashMap<Object, Object> hashMap, TreeMap<Object, Object> treeMap) {
        long startPutHashMap = System.nanoTime();
        hashMap.put("SAS", 10);
        hashMap.put("GSG", 30);
        hashMap.put("SWAT", 15);
        hashMap.put("GIGN", 20);
        hashMap.put("A", 45);
        long finishPutHashMap = System.nanoTime();
        long timePutHashMap = finishPutHashMap - startPutHashMap;
        System.out.println("HASH MAP Добовляем 5 позицией чере put");
        System.out.println(timePutHashMap);

        long startPutTreeMap = System.nanoTime();
        treeMap.put("SAS", 10);
        treeMap.put("GSG", 30);
        treeMap.put("SWAT", 15);
        treeMap.put("GIGN", 20);
        treeMap.put("A", 45);
        long finishPutTreeMap = System.nanoTime();
        long timePutTreeMap = finishPutTreeMap - startPutTreeMap;
        System.out.println("TREE MAP Добовляем 5 позицией чере put");
        System.out.println(timePutTreeMap);
    }

    private static void addSetAndTree(Set<Integer> set, Set<Integer> tree) {
        System.out.println("Время добовления 5ти элементов через add set");
        long startSetAdd = System.nanoTime();
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
        long finishSetAdd = System.nanoTime();
        long timeSetAdd = finishSetAdd - startSetAdd;
        System.out.println(timeSetAdd);

        System.out.println("Время добовления 5ти элементов через add tree");
        long startTreeAdd = System.nanoTime();
        tree.add(15);
        tree.add(16);
        tree.add(17);
        tree.add(18);
        tree.add(19);
        long finishTreeAdd = System.nanoTime();
        long timeTreeAdd = finishTreeAdd - startTreeAdd;
        System.out.println(timeTreeAdd);
    }

    private static void sizeSetAndTree(Set<Integer> set, Set<Integer> tree) {
        getSizeMap("Размер set", set.size(), "Размер tree", tree.size());
    }

    private static void addHasAndTree(Set<Integer> set, Set<Integer> tree) {
        for (int i = 0; i < 10; i++) {
            set.add(i);
            tree.add(i);
        }
    }

    private static void clear(Set<Integer> set) {
        long startСlear = System.nanoTime();
        set.clear();
        long finishСlear = System.nanoTime();
        System.out.println("Удаляем все HashSet");
        long timeСlear = finishСlear - startСlear;
        System.out.println(timeСlear);
    }

    private static void remove(Set<Integer> set) {
        System.out.println("Удаляем по одному");
        long startRemove = System.nanoTime();
        set.remove(0);
        set.remove(1);
        set.remove(2);
        set.remove(3);
        set.remove(4);
        set.remove(5);
        set.remove(6);
        set.remove(7);
        set.remove(8);
        set.remove(9);
        long finishRemove = System.nanoTime();
        long timeRemove = finishRemove - startRemove;
        System.out.println(timeRemove);
    }
}
