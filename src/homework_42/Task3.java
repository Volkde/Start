package homework_42;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Task3 {

    private Map<String, List<String>> synonymMap = new HashMap<>();


    public void addSynonym(String word, String synonym) {

        List<String> synonyms = synonymMap.getOrDefault(word, new ArrayList<>());
        synonyms.add(synonym);
        synonymMap.put(word, synonyms);
    }

    public List<String> getSynonyms(String word) {

        return synonymMap.getOrDefault(word, new ArrayList<>());
    }


    public void updateSynonyms(String word, List<String> synonyms) {
        synonymMap.put(word, synonyms);
    }


    public void removeSynonym(String word, String synonym) {

        List<String> synonyms = synonymMap.get(word);
        if (synonyms != null) {
            synonyms.remove(synonym);

            if (synonyms.isEmpty()) {
                synonymMap.remove(word);
            } else {
                synonymMap.put(word, synonyms);
            }
        }
    }


    public void removeWord(String word) {

        synonymMap.remove(word);
    }

    public static void main(String[] args) {
        Task3 dictionary = new Task3();


        dictionary.addSynonym("быстрый", "скорый");
        dictionary.addSynonym("быстрый", "стремительный");


        System.out.println("Синонимы для слова 'быстрый': " + dictionary.getSynonyms("быстрый"));


        List<String> newSynonyms = new ArrayList<>();
        newSynonyms.add("резвый");
        newSynonyms.add("шустрый");
        dictionary.updateSynonyms("быстрый", newSynonyms);
        System.out.println("Обновленные синонимы для слова 'быстрый': " + dictionary.getSynonyms("быстрый"));


        dictionary.removeSynonym("быстрый", "шустрый");
        System.out.println("Синонимы после удаления 'шустрый': " + dictionary.getSynonyms("быстрый"));


        dictionary.removeWord("быстрый");
        System.out.println("Словарь после удаления слова 'быстрый': " + dictionary.getSynonyms("быстрый"));

    }
}

