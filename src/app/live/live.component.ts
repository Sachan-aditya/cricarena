import { Component, OnInit } from '@angular/core';
import { ApiCallService } from '../services/api-call.service';
import { CommonModule, JsonPipe } from '@angular/common';

@Component({
  selector: 'app-live',
  standalone: true,
  imports: [JsonPipe,CommonModule],
  templateUrl: './live.component.html',
  styleUrl: './live.component.css'
})
export class LiveComponent implements OnInit {
[x: string]: any;
  livematches:any
  constructor (private api:ApiCallService)
  {
    
  }
  ngOnInit(): void {
    this.livemethod();
  }


  private livemethod() {
    this.api.getLiveMatches().subscribe({
      next: data => {
        console.log(data);
        this.livematches=data;
      },
      error: err => {
        console.log(err);
      }

    });
  }
}
