import axios from "axios";

const API_URL = "http://localhost:8080/api/";

const apiClient = axios.create({
    baseURL: API_URL,
    withCredentials: false,
    headers: {
      Accept: 'application/json',
      'Content-Type': 'application/json',
    },
  });

export default{
    get(message){
      if (message == "Desert"){
        return apiClient.get("/desert");
      }
      else if (message == "Drinks"){
        return apiClient.get("/drinks")
      }
      else if (message == "Seafood"){
        return apiClient.get("/seafood")
      }
      else if (message == "Meat"){
        return apiClient.get("/Meat")
      }
      else if (message == "BBQ Beaf"){
        return apiClient.get("/bbqbeaf")
      }
      else if (message == "Soups"){
        return apiClient.get("/soup")
      }
    },
    post(message){
      if (message == "sibmit-form"){
        apiClient.post("/submit-form")
      }
    }
};