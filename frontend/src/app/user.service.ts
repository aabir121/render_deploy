import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { environment} from "../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  getUsers() {
    console.log("new deploy");
    return this.http.get(environment.apiUrl + "/data");
  }
}
