<template>
  <v-app>
    <v-app-bar color="primary">
      <v-app-bar-nav-icon variant="text" @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
      <v-toolbar-title>Demo toolbar</v-toolbar-title>
      <v-spacer></v-spacer>
      <template v-if="$vuetify.display.mdAndUp">
        <v-btn icon="mdi-magnify" variant="text"></v-btn>
        <v-btn icon="mdi-filter" variant="text"></v-btn>
      </template>

      <v-btn icon="mdi-dots-vertical" variant="text"></v-btn>
    </v-app-bar>

    <v-navigation-drawer v-model="drawer" app>
      <v-list
        dense
        nav
      >
        <v-list-item
          v-for="menu in menus"
          :key="menu.title"
          :to="menu.to"
          link
        >
          <v-list-item-title>{{ menu.title }}</v-list-item-title>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>

    <v-main style="height: 100vh;">
      <v-container
        fluid
      >
        <router-view />
      </v-container>
    </v-main>
  </v-app>
</template>

<script>
export default {
  name: 'App',
  components: {

  },
  data: () => ({
    login: false,
    drawer: false,
    group: null,
    menus: [
      { title: 'Dashboard', icon: 'mdi-view-dashboard', to: '/dashboard' },
      { title: 'Grid System', icon: 'mdi-forum', to: '/grid-system' },
    ],
    right: null
  }),
  watch: {
    group () {
      this.drawer = false
    },
  },
}
</script>

<style>

</style>
