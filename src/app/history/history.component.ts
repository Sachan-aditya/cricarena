import { Component, OnInit } from '@angular/core';
import { ApiCallService } from '../services/api-call.service';
import { error } from 'console';
import { CommonModule, JsonPipe } from '@angular/common';

@Component({
  selector: 'app-history',
  standalone: true,
  imports: [CommonModule,JsonPipe],
  templateUrl: './history.component.html',
  styleUrl: './history.component.css'
})
export class HistoryComponent  implements OnInit{
  [x: string]: any;
  allmatch:any
constructor(private api:ApiCallService)
{}
ngOnInit(): void {
  this.history();
}

//   ngOnInit(): void {
// this.apii.getAllMatches().subscribe({next:data=>{this.allmatch=data},
// error:error=>{
//   console.log(error)
// }})
//   }
// }
private history() {
  this.api.getAllMatches().subscribe({
    next: data => {
      console.log(data);
      this.allmatch=data;
    },
    error: err => {
      console.log(err);
    }

  });
}
}
