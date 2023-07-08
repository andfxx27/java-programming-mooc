package andfxx.p8.hashmapgrouping;

import andfxx.p8.hashmapgrouping.dictionaryofmanytranslations.DictionaryOfManyTranslations;
import andfxx.p8.hashmapgrouping.storagefacility.StorageFacility;

public class HashMapGrouping {
    public static void hashMapGrouping() {
        System.out.println("Hello world from andfxx.p8.hashmapgrouping");

        storageFacility();
    }

    private static void storageFacility() {
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());
    }

    private static void dictionaryOfManyTranslations() {
        DictionaryOfManyTranslations dictionaryOfManyTranslations = new DictionaryOfManyTranslations();

        dictionaryOfManyTranslations.add("like", "Ingin");
        dictionaryOfManyTranslations.add("like", "Mau");
        dictionaryOfManyTranslations.add("like", "Hendak");

        System.out.println("Like indonesia translation: " + dictionaryOfManyTranslations.translate("like"));

        dictionaryOfManyTranslations.remove("like");

        System.out.println("Like indonesia translation: " + dictionaryOfManyTranslations.translate("like"));
    }
}
