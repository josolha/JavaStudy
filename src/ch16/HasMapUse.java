package ch16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HasMapUse {


    public static void main(String[] args) {
        HasMapUse Map = new HasMapUse();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        Map.solution(id_list,report,k);

    }
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer =  new int[id_list.length] ;
        HashMap<String, Integer> idMap = new HashMap<>(); // 유저 순서저장
        HashMap<String, HashSet<String>> map = new HashMap<>(); // 각 유저별 자신을 신고한 유저 set
        int index = 0;

        for (String s : id_list) {
            idMap.put(s,index);
            map.put(s,new HashSet<>());
        }
        System.out.println(map);

        for (String s : report) {
            String[] tmp = s.split(" ");
            map.get(tmp[1]).add(tmp[0]);
        }
        System.out.println(map);

        for (int i = 0; i < id_list.length ; i++) {
            HashSet<String> set = map.get(id_list[i]);
//            System.out.println(set);
            if(set.size() >= k){
                for (String s : set) {
                    answer[idMap.get(s)]++;
                }
            }

        }


        return answer;

    }

}
