package com.manoharadepu.BackendLogic;

public class Endpoints {
    public static String HOSTNAME = "http://localhost:8080";

    /**
     * Food Seller Collection Endpoints
     */
    public static String FIND_SELLER_BY_EMAIL = HOSTNAME + "/foodSellers/search/findByEmail?email=";
    public static String FIND_SELLER_BY_PASSWORD = HOSTNAME + "/foodSellers/search/findByPassword?password=";
    public static String FIND_SELLER_BY_STORENAME = HOSTNAME + "/foodSellers/search/findByStoreName?storeName=";
    public static String FIND_SELLER_BY_DESCRIPTION = HOSTNAME + "/foodSellers/search/findByDescription?description=";
    public static String FIND_SELLER_BY_STOREID = HOSTNAME + "/foodSellers/search/storeID?storeID=";
}
