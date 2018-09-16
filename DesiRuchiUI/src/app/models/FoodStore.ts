
export interface NutritionFacts2 {
    cholestrol: string;
    Protien: string;
    DietaryFiber: string;
    calcium: string;
    TotalCarbs: string;
}

export interface NutritionFacts {
    nutritionFacts: NutritionFacts2;
}

export interface Ingredients {
    ingredients: string[];
}

export interface FoodItem {
    itemName: string;
    nutritionFacts: NutritionFacts;
    ingredients: Ingredients;
    rating: string;
    price: number;
    itemCategory: string;
}

export interface FoodStoreCategory {
    categoryName: string;
    foodItems: FoodItem[];
}

export interface Location {
    country: string;
    indianState: string;
    usState?: any;
    indianCity: string;
    usCity?: any;
    pincode: number;
}

export interface ContactInfo {
    managerName: string;
    storeEmailId?: any;
    storeContact?: any;
    managerContact: string;
}

export interface FoodStore {
    storeId: number;
    storeName: string;
    foodStoreCategories: FoodStoreCategory[];
    location: Location;
    rating: string;
    contactInfo: ContactInfo;
}
