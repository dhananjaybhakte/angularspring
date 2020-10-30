import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private url = "http://localhost:8080";

  private extractData(res: Response) {
    let body = res;
    return body || null;
  }

  constructor(private http: HttpClient) { }

  public getEmployeeList(): Observable<any> {
    return this.http
      .get(this.url + '/getEmployeeList')
      .pipe(map(this.extractData));
  }
}
