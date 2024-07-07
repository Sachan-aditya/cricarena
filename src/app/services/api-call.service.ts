import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../environments/environment'; // Import the environment object

@Injectable({
  providedIn: 'root'
})
export class ApiCallService {

  constructor(private http: HttpClient) { }

  getAllMatches() {
    return this.http.get(`${environment.apiurl}/match`); // Use backticks for string interpolation
  }

  getLiveMatches() {
    return this.http.get(`${environment.apiurl}/match/live`); // Use backticks for string interpolation
  }

  getPointsTable() {
    return this.http.get(`${environment.apiurl}/match/pointtable`); // Use backticks for string interpolation
  }
}