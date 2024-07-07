import { Routes } from '@angular/router';
import { LiveComponent } from './live/live.component';
import { PointsTableComponent } from './points-table/points-table.component';
import { HistoryComponent } from './history/history.component';
import { HomeComponent } from './home/home.component';

export const routes: Routes = [
{
    path:"live",
    component:LiveComponent,
    title:"LiveMatch"
},{
    path:"home",
    component:HomeComponent,
    title:"HomePage"
},{
    path:"history",
    component:HistoryComponent,
    title:"MatchHistory"
},{
    path:"pointstable",
    component:PointsTableComponent,
    title:"PointsTable"
},


];
