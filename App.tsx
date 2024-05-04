import React from 'react';
import {Button, SafeAreaView, View} from 'react-native';

import {initialize, requestPermission} from 'react-native-health-connect';

function App(): React.JSX.Element {
  const requestPermissions = async () => {
    const isInitialized = await initialize();
    console.log({isInitialized});
    requestPermission([
      {
        accessType: 'read',
        recordType: 'ActiveCaloriesBurned',
      },
      {
        accessType: 'write',
        recordType: 'ActiveCaloriesBurned',
      },
    ]).then(permissions => {
      console.log('Granted permissions ', {permissions});
    });
  };
  return (
    <SafeAreaView>
      <View>
        <Button
          title="Health Connect - Request Permissions"
          onPress={requestPermissions}
        />
      </View>
    </SafeAreaView>
  );
}

export default App;
