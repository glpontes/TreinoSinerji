
import { initializeApp } from "firebase/app";
import { getAuth } from "firebase/auth";

const firebaseConfig = {
  apiKey: "AIzaSyDe2I24RakjoyE5bzRU998MrddinWIFarc",
  authDomain: "book-list-with-firebase-db6e1.firebaseapp.com",
  projectId: "book-list-with-firebase-db6e1",
  storageBucket: "book-list-with-firebase-db6e1.appspot.com",
  messagingSenderId: "759344847785",
  appId: "1:759344847785:web:58f869111e8af8c59fc2b8"
};


const app = initializeApp(firebaseConfig);
export const auth = getAuth(app);