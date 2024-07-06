import { Component, OnInit } from '@angular/core';
import { ApiCallService } from '../services/api-call.service';
import { NgFor, SlicePipe } from '@angular/common';

@Component({
  selector: 'app-points-table',
  standalone: true,
  templateUrl: './points-table.component.html',
  styleUrls: ['./points-table.component.css'],
  imports:[NgFor,SlicePipe],
})
export class PointsTableComponent implements OnInit {
  pointtable: any;
  tableheading: any;

  constructor(private api: ApiCallService) {}

  ngOnInit(): void {
    this.api.getPointsTable().subscribe({
      next: data => {
        this.pointtable = data;
        this.tableheading = [...this.pointtable[0]];
      },
      error: error => {
        console.log(error);
      }
    });
  }
  // In your component.ts file
}