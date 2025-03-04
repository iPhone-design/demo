<template>
  <v-container
    fluid>
    <v-card class="pa-3">
      <v-row v-for="sample in data.sampleList" :key="sample.id">
        <v-col>
          <v-card
            class="pa-3"
            outlined
          >
            {{ sample.name }}
          </v-card>
        </v-col>
        <v-col>
          <v-card
            class="pa-3"
            outlined
          >
            {{ sample.description }}
          </v-card>
        </v-col>
        <v-col>
          <v-card
            class="pa-3"
            outlined
          >
            {{ sample.useYn }}
          </v-card>
        </v-col>
        <v-col>
          <v-card
            class="pa-3"
            outlined
          >
            {{ sample.regUser }}
          </v-card>
        </v-col>
      </v-row>
    </v-card>
  </v-container>
</template>

<script>
import { onMounted, reactive } from 'vue'
import axios from 'axios'

export default {
  name: 'grid-system',
  components: {

  },
  setup() {
    const data = reactive({
      sampleList: []
    });

    const getList = () => {
      axios.get('/api/samples.do')
          .then(response => {
            data.sampleList = response.data;
          })
          .catch(error => {
            console.error(error);
          });
    }
    onMounted(() => {
      getList();
    });
    return {
      data: data,
      getList: getList
    }
  }
}
</script>

<style>

</style>
