import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Person } from './dashboard';
import { catchError } from 'rxjs/operators';



@Injectable()
export class DashboardService {
    constructor(private http: HttpClient) {}

    getAllPersonList(): Observable<Person[]> {
          return this.http.get<Person[]>('http://localhost:8081/fibi/list').pipe(
          catchError(this.handleError)
          );

    }

    private handleError(error: Response) {
        return Observable.throw(error);
    }


}
