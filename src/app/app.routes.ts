import { Component } from '@angular/core';
import { Routes } from '@angular/router';
import { HomeComponent } from '../../pages/home/home.component';
import { HistoryComponent } from '../../pages/history/history.component';
import { LiveComponent } from '../../pages/live/live.component';
import { PointsTableComponent } from '../../pages/points-table/points-table.component';

export const routes: Routes = [
    {
 path:"home",
 component:HomeComponent,
 title:"Home Page | CrickLive"

    },
    {
      path: 'history',
      component:HistoryComponent,
      title:"Match History | CrickLive"
    },
    {
        path: 'live',
        component:LiveComponent,
        title:"Live Matches | CrickLive"

    },
    {
        path: 'points-table',
        component:PointsTableComponent,
        title:"PointTable | CrickLive"
    }
];
