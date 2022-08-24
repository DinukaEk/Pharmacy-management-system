/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Neha Ghate
 */
public class AddData {
    
    public void setInitialValues(PharmacyDirectory pharmacyDirectory)
            
    {
        PharmacyDirectory pharmaDirectory = pharmacyDirectory;
        
       Pharmacy pharma1 = new Pharmacy();
               
       Pharmacy pharma2 = new Pharmacy();
       
               
       pharma1.setStoreName("Store1");
       pharma2.setStoreName("Store2");
        
       pharmaDirectory.addPharmacy(pharma1);
      pharmaDirectory.addPharmacy(pharma2);
        Drug drug1 = new Drug();
        
        
        //drug1.setDrugID(1);
        drug1.setDrugName("Panadol");
        drug1.setDrugType("paracetemol");
        drug1.setComposition("paracetemol ");
        drug1.setDrugAvailibility(300);
        drug1.setDrugPrice(20);
        drug1.setDrugDescription("used for fever");
        drug1.setExpirationDate("26-11-2020");
        drug1.setManufacturedDate("27-11-2019");
        pharma1.getDrugCatalog().addDrugs(drug1);
        
        Drug drug2 = new Drug();
        //drug2.setDrDrugugID(2);
        drug2.setDrugName("Anacin");
        drug2.setDrugType("antacid");
        drug2.setComposition("antacid ");
        drug2.setDrugAvailibility(80);
        drug2.setDrugPrice(30);
        drug2.setDrugDescription("used for acidity");
        drug2.setExpirationDate("20-07-2021");
        drug2.setManufacturedDate("10-01-2019");
        pharma1.getDrugCatalog().addDrugs(drug2);
        
        Drug drug3 = new Drug();
        //drug2.setDrDrugugID(2);
        drug3.setDrugName("Insulin");
        drug3.setDrugType("Hormone Therapy");
        drug3.setComposition("Hormone Therapy");
        drug3.setDrugAvailibility(150);
        drug3.setDrugPrice(40);
        drug3.setDrugDescription("used for diabetes");
        drug3.setExpirationDate("20-10-2020");
        drug3.setManufacturedDate("10-11-2019");
        pharma1.getDrugCatalog().addDrugs(drug3);
        
        Drug drug4 = new Drug();
        //drug2.setDrDrugugID(2);
        drug4.setDrugName("Colestipol");
        drug4.setDrugType("Colestipol");
        drug4.setComposition("Colestipol");
        drug4.setDrugAvailibility(50);
        drug4.setDrugPrice(24);
        drug4.setDrugDescription("used for Cholesterol");
        drug4.setExpirationDate("07-04-2021");
        drug4.setManufacturedDate("13-12-2019");
        pharma1.getDrugCatalog().addDrugs(drug4);
        
        Drug drug5 = new Drug();
        drug5.setDrugName("Antharil");
        drug5.setDrugType("Topical");
        drug5.setComposition("Topical");
        drug5.setDrugAvailibility(230);
        drug5.setDrugPrice(10);
        drug5.setDrugDescription("used for Hair Loss");
        drug5.setExpirationDate("26-04-2020");
        drug5.setManufacturedDate("16-11-2019");
        pharma1.getDrugCatalog().addDrugs(drug5);
        
        
        
        Drug drug12 = new Drug();
        //drug12.setDrugID(3);
        drug12.setDrugName("Aspirin");
        drug12.setDrugType("salicylate");
        drug12.setComposition("salicylate");
        drug12.setDrugAvailibility(200);
        drug12.setDrugPrice(15);
        drug12.setDrugDescription("used for simple pain");
        drug12.setExpirationDate("01-10-2022");
        drug12.setManufacturedDate("10-10-2019");
        pharma2.getDrugCatalog().addDrugs(drug12);
        
        Drug drug13 = new Drug();
        //drug12.setDrugID(3);
        drug13.setDrugName("Acetaminophen");
        drug13.setDrugType("Acetaminophen");
        drug13.setComposition("Acetaminophen");
        drug13.setDrugAvailibility(149);
        drug13.setDrugPrice(20);
        drug13.setDrugDescription("used for Arthritis");
        drug13.setExpirationDate("13-05-2021");
        drug13.setManufacturedDate("30-04-2019");
        pharma2.getDrugCatalog().addDrugs(drug13);
        
        Drug drug14 = new Drug();
        //drug12.setDrugID(3);
        drug14.setDrugName("Anesthetics");
        drug14.setDrugType("Topical");
        drug14.setComposition("Topical");
        drug14.setDrugAvailibility(310);
        drug14.setDrugPrice(35);
        drug14.setDrugDescription("used for Bites and Stings");
        drug14.setExpirationDate("24-09-2022");
        drug14.setManufacturedDate("19-02-2019");
        pharma2.getDrugCatalog().addDrugs(drug14);
        
        Drug drug15 = new Drug();
        //drug12.setDrugID(3);
        drug15.setDrugName("Vitamin K");
        drug15.setDrugType("Vitamin K");
        drug15.setComposition("Vitamin K");
        drug15.setDrugAvailibility(90);
        drug15.setDrugPrice(15);
        drug15.setDrugDescription("used for Bleeding");
        drug15.setExpirationDate("20-10-2021");
        drug15.setManufacturedDate("10-10-2019");
        pharma2.getDrugCatalog().addDrugs(drug15);
        
    }
    public void setStoreInitialValues(StoreDirectory storeDirectory){
        StoreDirectory sd = storeDirectory;
        
        Store store1 = new Store();
        
        Store store2 = new Store();
        
        
        store1.setStoreName("Pharmacy1");
        store1.setStoreLocation("Colombo");
        sd.addStore(store1);
        
        store2.setStoreName("Pharmacy2");
        store2.setStoreLocation("Kandy");
        sd.addStore(store2);
        
       
    }
                
}
